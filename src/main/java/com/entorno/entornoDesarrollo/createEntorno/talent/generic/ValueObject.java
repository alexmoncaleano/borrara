package com.entorno.entornoDesarrollo.createEntorno.talent.generic;

import java.io.Serializable;

public interface ValueObject<T> extends Serializable {
    T value();
}
