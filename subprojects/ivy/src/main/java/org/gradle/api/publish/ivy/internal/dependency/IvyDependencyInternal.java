/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.publish.ivy.internal.dependency;

import org.gradle.api.artifacts.DependencyArtifact;
import org.gradle.api.artifacts.ExcludeRule;
import org.gradle.api.internal.attributes.ImmutableAttributes;
import org.gradle.api.publish.ivy.IvyDependency;
import org.gradle.util.Path;

import javax.annotation.Nullable;

public interface IvyDependencyInternal extends IvyDependency {
    Iterable<DependencyArtifact> getArtifacts();

    Iterable<ExcludeRule> getExcludeRules();

    ImmutableAttributes getAttributes();

    @Nullable
    Path getProjectIdentityPath();
}
