/*
 * The MIT License (MIT)
 *
 * Copyright (C) 2017-2018 Fabricio Barros Cabral
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.fabriciofx.rps.infra;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A map of entries.
 *
 * @param <K> The key type.
 * @param <V> The value type.
 * @since 1.2
 */
public final class MapEntries<K, V> implements Map<K, V> {
    /**
     * Entries.
     */
    private final Map<K, V> entries;

    /**
     * Ctor.
     * @param ntrs The entries
     */
    @SafeVarargs
    public MapEntries(final Map.Entry<K, V>... ntrs) {
        this.entries = Stream.of(ntrs).collect(
            Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue
            )
        );
    }

    @Override
    public int size() {
        return this.entries.size();
    }

    @Override
    public boolean isEmpty() {
        return this.entries.isEmpty();
    }

    @Override
    public boolean containsKey(final Object key) {
        return this.entries.containsKey(key);
    }

    @Override
    public boolean containsValue(final Object value) {
        return this.entries.containsValue(value);
    }

    @Override
    public V get(final Object key) {
        return this.entries.get(key);
    }

    @Override
    public V put(final K key, final V value) {
        throw new UnsupportedOperationException("#put()");
    }

    @Override
    public V remove(final Object key) {
        throw new UnsupportedOperationException("#remove()");
    }

    @Override
    public void putAll(final Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("#putAll()");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("#clear()");
    }

    @Override
    public Set<K> keySet() {
        return this.entries.keySet();
    }

    @Override
    public Collection<V> values() {
        return this.entries.values();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return this.entries.entrySet();
    }
}
