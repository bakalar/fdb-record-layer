/*
 * SemanticAttribute.java
 *
 * This source file is part of the FoundationDB open source project
 *
 * Copyright 2015-2020 Apple Inc. and the FoundationDB project authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.apple.foundationdb.record.query.plan.temp.explain;

/**
 * Semantic attribute.
 */
public class SemanticAttribute extends Attribute {
    /**
     * Static factory method to call the private constructor.
     * @param reference the reference
     * @return a newly constructed semantic attribute
     */
    public static SemanticAttribute of(final Object reference) {
        return new SemanticAttribute(reference);
    }
    
    public SemanticAttribute(final Object reference) {
        super(reference);
    }

    @Override
    public boolean isSemanticAttribute() {
        return true;
    }
}
