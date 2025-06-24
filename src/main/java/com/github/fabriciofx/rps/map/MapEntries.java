/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.map;

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
     * @param entries The entries
     */
    @SafeVarargs
    public MapEntries(final Map.Entry<K, V>... entries) {
        this.entries = Stream.of(entries).collect(
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
