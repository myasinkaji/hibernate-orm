/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.internal.util;

public class MutableLong {
	private long value;

	public MutableLong() {
	}

	public MutableLong(long value) {
		this.value = value;
	}

	public MutableLong deepCopy() {
		return new MutableLong( value );
	}

	public long getAndIncrement() {
		return value++;
	}

	public long incrementAndGet() {
		return ++value;
	}

	public long get() {
		return value;
	}

	public void set(long value) {
		this.value = value;
	}

	public void increase() {
		++value;
	}
}
