package io.crossplane.sdk.xfn.javasdk.model;

import com.google.gson.internal.LinkedTreeMap;
import com.google.protobuf.Struct;

public class ResourceDTO {


    Struct resource;


    public Struct getResource() {
        return resource;
    }

    public void setResource(Struct resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "ResourceDTO{" +
                ", resource=" + resource +
                '}';
    }
}
