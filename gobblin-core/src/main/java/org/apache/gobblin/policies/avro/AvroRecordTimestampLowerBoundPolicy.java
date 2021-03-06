/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.gobblin.policies.avro;

import org.apache.gobblin.configuration.State;
import org.apache.gobblin.policies.time.RecordTimestampLowerBoundPolicy;
import org.apache.gobblin.writer.partitioner.TimeBasedAvroWriterPartitioner;
import org.apache.gobblin.writer.partitioner.TimeBasedWriterPartitioner;

/**
 * An implementation of {@link RecordTimestampLowerBoundPolicy} for Avro records.
 *
 * @author Ziyang Liu
 */
public class AvroRecordTimestampLowerBoundPolicy extends RecordTimestampLowerBoundPolicy {

  public AvroRecordTimestampLowerBoundPolicy(State state, Type type) {
    super(state, type);
  }

  @Override
  protected TimeBasedWriterPartitioner<?> getPartitioner() {
    return new TimeBasedAvroWriterPartitioner(this.state);
  }

}
