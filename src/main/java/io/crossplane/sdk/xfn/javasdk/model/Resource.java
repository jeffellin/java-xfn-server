package io.crossplane.sdk.xfn.javasdk.model;

import com.google.gson.internal.LinkedTreeMap;
import com.google.protobuf.Value;

import java.util.Map;

public class Resource {


    LinkedTreeMap resource;

    public LinkedTreeMap getResource() {
        return resource;
    }

    public void setResource(LinkedTreeMap resource) {
        this.resource = resource;
    }



    @Override
    public String toString() {
        return "Resource{" +
                ", resource=" + resource +
                '}';
    }
}
