/**
 * palava - a java-php-bridge
 * Copyright (C) 2007-2010  CosmoCode GmbH
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package de.cosmocode.palava.concurrent;


/**
 * Constant holder class for executor service configuration keys.
 *
 * @author Willi Schoenborn
 */
final class ExecutorServiceConfig {

    public static final String MIN_POOL_SIZE = "minPoolSize";
    
    public static final String MAX_POOL_SIZE = "maxPoolSize";
    
    public static final String KEEP_ALIVE_TIME = "keepAliveTime";
    
    public static final String KEEP_ALIVE_TIME_UNIT = "keepAliveTimeUnit";
    
    public static final String QUEUE_MODE = "queueMode";
    
    public static final String QUEUE_CAPACITY = "queueCapacity";
    
    public static final String THREAD_FACTORY = "threadFactory";
    
    public static final String SHUTDOWN_TIMEOUT = "shutdownTimeout";
    
    public static final String SHUTDOWN_TIMEOUT_UNIT = "shutdownTimeoutUnit";
    
    private ExecutorServiceConfig() {
        
    }
    
}
