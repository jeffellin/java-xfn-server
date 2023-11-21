package io.crossplane.sdk.xfn.javasdk.controller;

import apiextensions.fn.proto.v1beta1.FunctionRunnerServiceGrpc;
import apiextensions.fn.proto.v1beta1.RunFunction;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class XFunctionController extends FunctionRunnerServiceGrpc.FunctionRunnerServiceImplBase {

    public void runFunction(RunFunction.RunFunctionRequest request,
                            StreamObserver<RunFunction.RunFunctionResponse> responseObserver) {

    }




}
