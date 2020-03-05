package org.jclouds.aliyun.oss;

import static org.jclouds.blobstore.attr.BlobScopes.CONTAINER;

import org.jclouds.blobstore.attr.BlobScope;

import java.io.Closeable;
import java.util.Set;

import com.aliyun.oss.OSS;

@BlobScope(CONTAINER)
public interface OSSApi extends Closeable {

   static final String DEFAULT_REGION = "oss-cn-shanghai";

   OSS getOSSClient(String region);

   Set<String> getAvailableRegions();
}
