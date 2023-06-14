import java.util.*;
import java.util.stream.*;

class Task5 implements StreamZipper {
    @Override
    public <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Spliterator<T> firstSpliterator = first.spliterator();
        Spliterator<T> secondSpliterator = second.spliterator();

        int characteristics = firstSpliterator.characteristics() & secondSpliterator.characteristics()
                & ~(Spliterator.DISTINCT | Spliterator.SORTED);

        long zipSize = ((characteristics & Spliterator.SIZED) != 0)
                ? Math.min(firstSpliterator.getExactSizeIfKnown(), secondSpliterator.getExactSizeIfKnown())
                : -1;

        Iterator<T> firstIterator = Spliterators.iterator(firstSpliterator);
        Iterator<T> secondIterator = Spliterators.iterator(secondSpliterator);

        Iterator<T> zipIterator = new Iterator<T>() {
            private boolean firstIteratorFinished = false;
            private boolean secondIteratorFinished = false;

            @Override
            public boolean hasNext() {
                return !firstIteratorFinished && !secondIteratorFinished;
            }

            @Override
            public T next() {
                if (!firstIteratorFinished && firstIterator.hasNext()) {
                    T firstElement = firstIterator.next();
                    firstIteratorFinished = !firstIterator.hasNext();
                    return firstElement;
                }

                if (!secondIteratorFinished && secondIterator.hasNext()) {
                    T secondElement = secondIterator.next();
                    secondIteratorFinished = !secondIterator.hasNext();
                    return secondElement;
                }

                throw new NoSuchElementException();
            }
        };

        Spliterator<T> zipSpliterator = Spliterators.spliterator(zipIterator, zipSize, characteristics);
        return StreamSupport.stream(zipSpliterator, false);
    }
}