/*
 * Copyright 2007,2016 EUROPEAN UNION
 * Licensed under the EUPL, Version 1.2 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * https://ec.europa.eu/isa2/solutions/european-union-public-licence-eupl_en
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 *
 * Date: 2020/05/11
 * Authors:
 * European Commission, Joint Research Centre - jrc-inspire-support@ec.europa.eu
 *
 * This work was supported by the Interoperability solutions for public
 * administrations, businesses and citizens programme (http://ec.europa.eu/isa2)
 * through Action 2016.10: European Location Interoperability Solutions for e-Government (ELISE)
 */
package eu.europa.ec.re3gistry2.crudinterface;

import eu.europa.ec.re3gistry2.model.RegItemclass;
import java.util.List;

public interface IRegItemclassManager {

    public RegItemclass get(String uuid) throws Exception;

    public List<RegItemclass> getAll() throws Exception;

    public RegItemclass getByLocalid(String localid) throws Exception;

    public boolean add(RegItemclass i) throws Exception;

    public boolean update(RegItemclass i) throws Exception;

    public boolean delete(RegItemclass i) throws Exception;

    public List<RegItemclass> getChildItemclass(RegItemclass regItemclass) throws Exception;

    public int getRegItemclassMaxDataprocedureorder() throws Exception;

    public List<RegItemclass> getAlltemclassOrderAscByDataprocedureorder() throws Exception;

    public List<RegItemclass> getAll(boolean systemItems) throws Exception;

}
