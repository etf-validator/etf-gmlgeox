/**
 * Copyright 2010-2019 interactive instruments GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.interactive_instruments.etf.bsxm;

import java.util.Arrays;

import org.deegree.cs.coordinatesystems.ICRS;
import org.deegree.geometry.GeometryFactory;
import org.deegree.geometry.primitive.Curve;
import org.deegree.geometry.primitive.segments.CurveSegment;

/**
 * Based on the implementation of {@link GeometryFactory}.
 */
public class IIGeometryFactory extends GeometryFactory {

    @Override
    public Curve createCurve(final String id, final ICRS crs, final CurveSegment... segments) {
        return (Curve) inspect(new IICurve(id, crs, pm, Arrays.asList(segments)));
    }
}