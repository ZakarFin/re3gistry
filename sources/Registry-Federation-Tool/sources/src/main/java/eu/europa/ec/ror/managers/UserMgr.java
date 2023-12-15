/*
 * Copyright 2010,2015 EUROPEAN UNION
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://ec.europa.eu/idabc/eupl
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 *
 * Date: __/__/____
 * Authors: European Commission, Joint Research Centre
 * inspire-registry-dev@jrc.ec.europa.eu
 *
 * This work was supported by the EU  Interoperability Solutions for
 * European Public Administrations Programme (http://ec.europa.eu/isa)
 * through Action 1.17: Re-usable INSPIRE Reference Platform 
 */
package eu.europa.ec.ror.managers;

import eu.europa.ec.ror.managers.util.EntityManagerCustom;
import eu.europa.ec.ror.model.User;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UserMgr {

    public static User getUserById(String id) {
        try {
            EntityManagerCustom emc = new EntityManagerCustom();
            EntityManager em = emc.getEntityManager();

            Query q = em.createNamedQuery("User.findByUuid");
            q.setParameter("uuid", id);
            User list = (User) q.getSingleResult();

            return list;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public static User getUserByEcasId(String id) {
        try {
            EntityManagerCustom emc = new EntityManagerCustom();
            EntityManager em = emc.getEntityManager();

            Query q = em.createNamedQuery("User.findByEcasid");
            q.setParameter("ecasid", id);
            User list = (User) q.getSingleResult();

            return list;
        } catch (Exception ex) {
            return null;
        }
    }

}
