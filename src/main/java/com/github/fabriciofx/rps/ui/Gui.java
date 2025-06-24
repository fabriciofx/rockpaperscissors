/*
 * SPDX-FileCopyrightText: Copyright (C) 2017-2025 Fabrício Barros Cabral
 * SPDX-License-Identifier: MIT
 */
package com.github.fabriciofx.rps.ui;

import com.github.fabriciofx.rps.Ui;
import javax.swing.JOptionPane;

/**
 * Graphical user interface.
 *
 * @since 1.0
 */
public final class Gui implements Ui {
    @Override
    public String name() {
        return "gui";
    }

    @Override
    public void show(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public String value(final String message) {
        return JOptionPane.showInputDialog(message);
    }
}
