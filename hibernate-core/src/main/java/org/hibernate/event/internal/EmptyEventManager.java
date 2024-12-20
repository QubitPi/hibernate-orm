/*
 * SPDX-License-Identifier: LGPL-2.1-or-later
 * Copyright Red Hat Inc. and Hibernate Authors
 */
package org.hibernate.event.internal;

import org.hibernate.LockMode;
import org.hibernate.cache.spi.Region;
import org.hibernate.cache.spi.access.CachedDomainDataAccess;
import org.hibernate.engine.spi.EntityEntry;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.event.spi.AutoFlushEvent;
import org.hibernate.event.spi.EventManager;
import org.hibernate.event.spi.HibernateMonitoringEvent;
import org.hibernate.event.spi.FlushEvent;
import org.hibernate.persister.collection.CollectionPersister;
import org.hibernate.persister.entity.EntityPersister;

/**
 * An {@link EventManager} that ignores all events.
 */
public final class EmptyEventManager implements EventManager {

	@Override
	public HibernateMonitoringEvent beginSessionOpenEvent() {
		return null;
	}

	@Override
	public void completeSessionOpenEvent(HibernateMonitoringEvent sessionOpenEvent, SharedSessionContractImplementor session) {

	}

	@Override
	public HibernateMonitoringEvent beginSessionClosedEvent() {
		return null;
	}

	@Override
	public void completeSessionClosedEvent(
			HibernateMonitoringEvent sessionClosedEvent,
			SharedSessionContractImplementor session) {

	}

	@Override
	public HibernateMonitoringEvent beginJdbcConnectionAcquisitionEvent() {
		return null;
	}

	@Override
	public void completeJdbcConnectionAcquisitionEvent(
			HibernateMonitoringEvent jdbcConnectionAcquisitionEvent,
			SharedSessionContractImplementor session,
			Object tenantId) {

	}

	@Override
	public HibernateMonitoringEvent beginJdbcConnectionReleaseEvent() {
		return null;
	}

	@Override
	public void completeJdbcConnectionReleaseEvent(
			HibernateMonitoringEvent jdbcConnectionReleaseEvent,
			SharedSessionContractImplementor session,
			Object tenantId) {

	}

	@Override
	public HibernateMonitoringEvent beginJdbcPreparedStatementCreationEvent() {
		return null;
	}

	@Override
	public void completeJdbcPreparedStatementCreationEvent(
			HibernateMonitoringEvent jdbcPreparedStatementCreation,
			String preparedStatementSql) {

	}

	@Override
	public HibernateMonitoringEvent beginJdbcPreparedStatementExecutionEvent() {
		return null;
	}

	@Override
	public void completeJdbcPreparedStatementExecutionEvent(
			HibernateMonitoringEvent jdbcPreparedStatementExecutionEvent,
			String preparedStatementSql) {

	}

	@Override
	public HibernateMonitoringEvent beginJdbcBatchExecutionEvent() {
		return null;
	}

	@Override
	public void completeJdbcBatchExecutionEvent(HibernateMonitoringEvent jdbcBatchExecutionEvent, String statementSql) {

	}

	@Override
	public HibernateMonitoringEvent beginCachePutEvent() {
		return null;
	}

	@Override
	public void completeCachePutEvent(
			HibernateMonitoringEvent cachePutEvent,
			SharedSessionContractImplementor session,
			Region region,
			boolean cacheContentChanged,
			CacheActionDescription description) {

	}

	@Override
	public void completeCachePutEvent(
			HibernateMonitoringEvent cachePutEvent,
			SharedSessionContractImplementor session,
			CachedDomainDataAccess cachedDomainDataAccess,
			EntityPersister persister,
			boolean cacheContentChanged,
			CacheActionDescription description) {

	}

	@Override
	public void completeCachePutEvent(
			HibernateMonitoringEvent cachePutEvent,
			SharedSessionContractImplementor session,
			CachedDomainDataAccess cachedDomainDataAccess,
			EntityPersister persister,
			boolean cacheContentChanged,
			boolean isNatualId,
			CacheActionDescription description) {

	}

	@Override
	public void completeCachePutEvent(
			HibernateMonitoringEvent cachePutEvent,
			SharedSessionContractImplementor session,
			CachedDomainDataAccess cachedDomainDataAccess,
			CollectionPersister persister,
			boolean cacheContentChanged,
			CacheActionDescription description) {

	}

	@Override
	public HibernateMonitoringEvent beginCacheGetEvent() {
		return null;
	}

	@Override
	public void completeCacheGetEvent(
			HibernateMonitoringEvent cacheGetEvent,
			SharedSessionContractImplementor session,
			Region region,
			boolean hit) {

	}

	@Override
	public void completeCacheGetEvent(
			HibernateMonitoringEvent cacheGetEvent,
			SharedSessionContractImplementor session,
			Region region,
			EntityPersister persister,
			boolean isNaturalKey,
			boolean hit) {

	}

	@Override
	public void completeCacheGetEvent(
			HibernateMonitoringEvent cacheGetEvent,
			SharedSessionContractImplementor session,
			Region region,
			CollectionPersister persister,
			boolean hit) {

	}

	@Override
	public HibernateMonitoringEvent beginFlushEvent() {
		return null;
	}

	@Override
	public void completeFlushEvent(HibernateMonitoringEvent flushEvent, FlushEvent event) {

	}

	@Override
	public void completeFlushEvent(HibernateMonitoringEvent flushEvent, FlushEvent event, boolean autoFlush) {

	}

	@Override
	public HibernateMonitoringEvent beginPartialFlushEvent() {
		return null;
	}

	@Override
	public void completePartialFlushEvent(HibernateMonitoringEvent flushEvent, AutoFlushEvent event) {

	}

	@Override
	public HibernateMonitoringEvent beginDirtyCalculationEvent() {
		return null;
	}

	@Override
	public void completeDirtyCalculationEvent(
			HibernateMonitoringEvent dirtyCalculationEvent,
			SharedSessionContractImplementor session,
			EntityPersister persister,
			EntityEntry entry,
			int[] dirtyProperties) {

	}

	@Override
	public HibernateMonitoringEvent beginPrePartialFlush() {
		return null;
	}

	@Override
	public void completePrePartialFlush(
			HibernateMonitoringEvent prePartialFlush,
			SharedSessionContractImplementor session) {

	}

	@Override
	public HibernateMonitoringEvent beginEntityInsertEvent() {
		return null;
	}

	@Override
	public void completeEntityInsertEvent(
			HibernateMonitoringEvent event,
			Object id, String entityName,
			boolean success,
			SharedSessionContractImplementor session) {

	}

	@Override
	public HibernateMonitoringEvent beginEntityUpdateEvent() {
		return null;
	}

	@Override
	public void completeEntityUpdateEvent(
			HibernateMonitoringEvent event,
			Object id, String entityName,
			boolean success,
			SharedSessionContractImplementor session) {

	}

	@Override
	public HibernateMonitoringEvent beginEntityUpsertEvent() {
		return null;
	}

	@Override
	public void completeEntityUpsertEvent(HibernateMonitoringEvent event, Object id, String entityName, boolean success, SharedSessionContractImplementor session) {

	}

	@Override
	public HibernateMonitoringEvent beginEntityDeleteEvent() {
		return null;
	}

	@Override
	public void completeEntityDeleteEvent(
			HibernateMonitoringEvent event,
			Object id, String entityName,
			boolean success,
			SharedSessionContractImplementor session) {

	}

	@Override
	public HibernateMonitoringEvent beginEntityLockEvent() {
		return null;
	}

	@Override
	public void completeEntityLockEvent(HibernateMonitoringEvent event, Object id, String entityName, LockMode lockMode, boolean success, SharedSessionContractImplementor session) {

	}

	@Override
	public HibernateMonitoringEvent beginCollectionRecreateEvent() {
		return null;
	}

	@Override
	public void completeCollectionRecreateEvent(HibernateMonitoringEvent event, Object id, String role, boolean success, SharedSessionContractImplementor session) {

	}

	@Override
	public HibernateMonitoringEvent beginCollectionUpdateEvent() {
		return null;
	}

	@Override
	public void completeCollectionUpdateEvent(HibernateMonitoringEvent event, Object id, String role, boolean success, SharedSessionContractImplementor session) {

	}

	@Override
	public HibernateMonitoringEvent beginCollectionRemoveEvent() {
		return null;
	}

	@Override
	public void completeCollectionRemoveEvent(HibernateMonitoringEvent event, Object id, String role, boolean success, SharedSessionContractImplementor session) {

	}
}
