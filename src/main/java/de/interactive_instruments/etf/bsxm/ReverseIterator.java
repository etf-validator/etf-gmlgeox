/**
 * Copyright 2010-2019 interactive instruments GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.interactive_instruments.etf.bsxm;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Jon Herrmann ( herrmann aT interactive-instruments doT de )
 */
public class ReverseIterator<T> implements Iterator<T>, Iterable<T> {

    private final ListIterator<T> it;

    public ReverseIterator(final List<T> list) {
        it = list.listIterator(list.size());
    }

    @Override
    public Iterator<T> iterator() {
        return it;
    }

    @Override
    public boolean hasNext() {
        return it.hasPrevious();
    }

    @Override
    public T next() {
        return it.previous();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}