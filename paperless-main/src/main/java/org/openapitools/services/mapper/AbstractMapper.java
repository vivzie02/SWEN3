package org.openapitools.services.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractMapper <S, T> implements Mapper<S, T> {
    // Mapping from S to T
    public List<T> map(Collection<S> sources) {
        List<T> targets = new ArrayList<>();
        for (S s : sources) {
            targets.add(map(s));
        }
        return targets;
    }
    // Mapping from T to S
    public List<S> reverseMap(Collection<T> targets) {
        List<S> entities = new ArrayList<>();
        for (T t : targets) {
            entities.add(reverseMap(t));
        }
        return entities;
    }




}
