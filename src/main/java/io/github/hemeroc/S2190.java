package io.github.hemeroc;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class S2190 {

    private final String identifier;

    public S2190(Long identifier) {
        this(String.valueOf(identifier));
    }

}