package org.openapitools.services.mapper;

public interface Mapper<S, T> {
    T map(S source);
    S reverseMap(T target);
}
