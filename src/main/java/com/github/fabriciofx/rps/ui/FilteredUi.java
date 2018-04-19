package com.github.fabriciofx.rps.ui;

import com.github.fabriciofx.rps.Ui;
/**
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version Id
 * @since
 */
public final class FilteredUi implements Ui {
    private final Ui origin;
    private final String regex;

    public FilteredUi(final Ui ui, final String rgx) {
        this.origin = ui;
        this.regex = rgx;
    }

    @Override
    public void print(final String message) {
        this.origin.print(message);
    }

    @Override
    public String value(final String message) {
        final String val = this.origin.value(message);
        if (!val.matches(this.regex)) {
            throw new IllegalArgumentException("error: out of specification");
        }
        return val;
    }
}
