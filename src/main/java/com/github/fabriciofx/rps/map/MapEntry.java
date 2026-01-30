/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2026 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.map;

import java.util.Map;

/**
 * A map entry.
 *
 * @param <K> Key type.
 * @param <V> Value type.
 * @since 1.2
 */
public final class MapEntry<K, V> implements Map.Entry<K, V> {
    /**
     * Key.
     */
    private final K key;

    /**
     * Value.
     */
    private final V value;

    /**
     * Ctor.
     * @param key The key
     * @param value The value
     */
    public MapEntry(final K key, final V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    @Override
    public V setValue(final V val) {
        throw new UnsupportedOperationException("MapEntry");
    }
}
