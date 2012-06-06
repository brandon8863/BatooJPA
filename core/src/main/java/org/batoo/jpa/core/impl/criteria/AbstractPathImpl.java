/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.batoo.jpa.core.impl.criteria;

import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Path;

/**
 * Abstract implementation of {@link Path}.
 * 
 * @param <X>
 *            the type referenced by the path
 * 
 * @author hceylan
 * @since $version
 */
public abstract class AbstractPathImpl<X> extends ExpressionImpl<X> implements Path<X> {

	private final AbstractPathImpl<?> parent;

	/**
	 * @param parent
	 *            the parent path, may be null
	 * 
	 * @since $version
	 * @author hceylan
	 */
	public AbstractPathImpl(AbstractPathImpl<?> parent) {
		super();

		this.parent = parent;
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public AbstractPathImpl<?> getParentPath() {
		return this.parent;
	}

	/**
	 * Returns the root of this path.
	 * 
	 * @return the root of this path
	 * 
	 * @since $version
	 * @author hceylan
	 */
	public AbstractFromImpl<?, ?> getRoot() {
		return this.parent.getRoot();
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public Expression<Class<? extends X>> type() {
		// TODO Auto-generated method stub
		return null;
	}

}