/* @(#) $$Id$$
 *
 * Copyright (c) 2000-2023 Comarch SA All Rights Reserved. Any usage,
 * duplication or redistribution of this software is allowed only according to
 * separate agreement prepared in written between Comarch and authorized party.
 */
package com.smalaca.salesproduct.command.domain.offer;

import java.util.Map;

/**
 * @author Tomasz Krygier
 */
interface ProductManagementService {
    Map<String, Price> getPriceOfAvailableProducts(Map<String, Integer> products);
}
