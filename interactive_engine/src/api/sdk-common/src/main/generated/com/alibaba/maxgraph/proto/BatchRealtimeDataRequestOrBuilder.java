// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sdk/client_frontend_protocol.proto

package com.alibaba.maxgraph.proto;

public interface BatchRealtimeDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BatchRealtimeDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .ClientBatchDataProto dataList = 1;</code>
   */
  boolean hasDataList();
  /**
   * <code>optional .ClientBatchDataProto dataList = 1;</code>
   */
  com.alibaba.maxgraph.proto.ClientBatchDataProto getDataList();
  /**
   * <code>optional .ClientBatchDataProto dataList = 1;</code>
   */
  com.alibaba.maxgraph.proto.ClientBatchDataProtoOrBuilder getDataListOrBuilder();

  /**
   * <code>optional string sessionId = 2;</code>
   */
  java.lang.String getSessionId();
  /**
   * <code>optional string sessionId = 2;</code>
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <code>optional .OperationType operationType = 3;</code>
   */
  int getOperationTypeValue();
  /**
   * <code>optional .OperationType operationType = 3;</code>
   */
  com.alibaba.maxgraph.proto.OperationType getOperationType();

  /**
   * <code>optional bool sync = 4;</code>
   */
  boolean getSync();
}
