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

import eu.europa.ec.re3gistry2.model.RegAction;
import eu.europa.ec.re3gistry2.model.RegField;
import eu.europa.ec.re3gistry2.model.RegItem;
import eu.europa.ec.re3gistry2.model.RegItemclass;
import eu.europa.ec.re3gistry2.model.RegLanguagecode;
import eu.europa.ec.re3gistry2.model.RegLocalization;
import eu.europa.ec.re3gistry2.model.RegRelation;
import java.util.List;

public interface IRegLocalizationManager{
    
    public RegLocalization get(String uuid) throws Exception;
    public List<RegLocalization> getAll() throws Exception;
    
    public boolean add(RegLocalization i) throws Exception;
    public boolean update(RegLocalization i) throws Exception;
    public boolean delete(RegLocalization i) throws Exception;
    
    public List<RegLocalization> getAll(RegItem regItem) throws Exception;
    public List<RegLocalization> getAll(RegItem regItem, RegLanguagecode regLanguagecode) throws Exception;
    public List<RegLocalization> getAllHrefNotNull(RegField regField, RegItemclass regItemclass) throws Exception;
    public List<RegLocalization> getAll(RegLanguagecode regLanguagecode, List<RegItem> regItems) throws Exception;
    public List<RegLocalization> getAll(RegItemclass regItemclass) throws Exception;
    public List<RegLocalization> getAll(RegField regField) throws Exception;
    public List<RegLocalization> getAll(RegField regField, RegItem regItem) throws Exception;
    public RegLocalization get(RegField regField, RegLanguagecode regLanguagecode) throws Exception;
    public List<RegLocalization> getAll(RegField regField, RegItem regItem, RegLanguagecode regLanguagecode) throws Exception;
    public List<RegLocalization> getAllWithRelationReference(RegItem regItem) throws Exception ;
    public List<RegLocalization> getAll(RegField regField, RegItem regItem, RegAction regAction) throws Exception;
    public List<RegLocalization> getAllByRelation(RegRelation relation) throws Exception;
    
    public List<RegLocalization> getAllFieldsByValue(String value) throws Exception;
    
}