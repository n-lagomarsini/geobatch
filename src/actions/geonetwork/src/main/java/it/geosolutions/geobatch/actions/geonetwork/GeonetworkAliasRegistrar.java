/*
 *  GeoBatch - Open Source geospatial batch processing system
 *  http://geobatch.geo-solutions.it/
 *  Copyright (C) 2007-2012 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 *
 *  GPLv3 + Classpath exception
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.geosolutions.geobatch.actions.geonetwork;

import it.geosolutions.geobatch.actions.geonetwork.configuration.GeonetworkDeleteConfiguration;
import it.geosolutions.geobatch.actions.geonetwork.configuration.GeonetworkInsertConfiguration;
import it.geosolutions.geobatch.registry.AliasRegistrar;
import it.geosolutions.geobatch.registry.AliasRegistry;

/**
 * Register XStream aliases for the relevant services in this module.
 * 
 * @author ETj <etj at geo-solutions>
 */
public class GeonetworkAliasRegistrar extends AliasRegistrar {

    public GeonetworkAliasRegistrar(AliasRegistry registry) {
        LOGGER.info(getClass().getSimpleName() + ": registering alias.");

        // this alias is here for backward compatibility: it should be renamed to GeonetworkInsert
        registry.putAlias("Geonetwork",GeonetworkInsertConfiguration.class);

        // this alias should replace the obsoleted "Geonetowrk" alias.
        registry.putAlias("GeonetworkInsert",GeonetworkInsertConfiguration.class);

        registry.putAlias("GeonetworkDelete",GeonetworkDeleteConfiguration.class);
        registry.putAlias("grant",GeonetworkInsertConfiguration.Privileges.class);
    }
}