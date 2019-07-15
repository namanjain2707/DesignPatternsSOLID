package net.media.training.live.lsp;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 12:52:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Set<T> extends Collection<T> {
    protected java.util.Set innerSet = new LinkedHashSet();

    @Override
    public void add(final T element) {
        innerSet.add(element);
    }

    @Override
    public boolean isMember(final T element) {
        return innerSet.contains(element);
    }
}
