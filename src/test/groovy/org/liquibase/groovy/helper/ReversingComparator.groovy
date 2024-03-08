/*
 * Copyright 2011-2024 Tim Berglund and Steven C. Saliman
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.liquibase.groovy.helper

/**
 * This class is an Resource Comparator that will result in changelogs being returned in reverse
 * order.  It is used to test the resourceComparator of an includeAll change.
 *
 * @author Steven C. Saliman
 */
class ReversingComparator implements Comparator<String> {
    @Override
    int compare(String s1, String s2) {
        return s2.compareTo(s1) // That's right, s2 comes first.
    }
}
