package net.media.training.live.lsp;

import java.util.LinkedHashSet;

public abstract class Collection<T> {
    protected java.util.Set innerSet = new LinkedHashSet();

    public int size() {
        return innerSet.size();
    }

    public abstract boolean isMember(final T element);
    public abstract void add(T element);
}
