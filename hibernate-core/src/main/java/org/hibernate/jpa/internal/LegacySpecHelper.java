/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.jpa.internal;

import java.util.function.Function;

import org.hibernate.internal.log.DeprecationLogger;

import static org.hibernate.internal.log.DeprecationLogger.DEPRECATION_LOGGER;

/**
 * @author Steve Ebersole
 */
public class LegacySpecHelper {
	private LegacySpecHelper() {
		// helper - disallow instantiation
	}

	public static Object getValue(
			String specName,
			String javaeeName,
			Function<String,?> valueAccess) {
		return getValue( specName, javaeeName, valueAccess, null );
	}

	public static Object getValue(
			String specName,
			String javaeeName,
			Function<String,?> valueAccess,
			Function<Object,Boolean> valueChecker) {
		final Object specValue = valueAccess.apply( specName );
		if ( specValue != null ) {
			if ( valueChecker == null || valueChecker.apply( specValue ) ) {
				return specValue;
			}
		}

		final Object javaeeValue = valueAccess.apply( javaeeName );
		if ( javaeeValue != null ) {
			if ( valueChecker == null || valueChecker.apply( javaeeValue ) ) {
				DEPRECATION_LOGGER.deprecatedSetting( javaeeName, specName );
				return javaeeValue;
			}
		}

		return null;
	}

	public static Integer getInteger(String specName, String javaeeName, Function<String,?> valueAccess) {
		final Object rawValue = getValue( specName, javaeeName, valueAccess );
		if ( rawValue == null ) {
			return null;
		}
		if ( rawValue instanceof Integer ) {
			return ( (Integer) rawValue );
		}
		return Integer.valueOf( rawValue.toString() );
	}

	public static Integer getInteger(
			String specName,
			String javaeeName,
			Function<String,?> valueAccess,
			Function<Object,Boolean> valueChecker) {
		final Object rawValue = getValue( specName, javaeeName, valueAccess, valueChecker );
		if ( rawValue == null ) {
			return null;
		}
		if ( rawValue instanceof Integer ) {
			return ( (Integer) rawValue );
		}
		return Integer.valueOf( rawValue.toString() );
	}


}
