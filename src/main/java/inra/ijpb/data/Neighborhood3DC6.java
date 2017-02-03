/*-
 * #%L
 * Mathematical morphology library and plugins for ImageJ/Fiji.
 * %%
 * Copyright (C) 2014 - 2017 INRA.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */
package inra.ijpb.data;

import java.util.ArrayList;

public class Neighborhood3DC6 extends Neighborhood3D {
	
	ArrayList<Cursor3D> neighbors = new ArrayList<Cursor3D>();

	@Override
	public Iterable<Cursor3D> getNeighbors() 
	{
		neighbors.clear();
		
		final int x = super.cursor.getX();
		final int y = super.cursor.getY();
		final int z = super.cursor.getZ();
		
		
		neighbors.add( new Cursor3D( x  , y  , z-1 ) );
		
		neighbors.add( new Cursor3D( x-1, y  , z   ) );		
		neighbors.add( new Cursor3D(   x, y-1, z   ) );
		neighbors.add( new Cursor3D(   x, y+1, z   ) );		
		neighbors.add( new Cursor3D( x+1, y  , z   ) );
		
		neighbors.add( new Cursor3D( x  , y  , z+1 ) );
		
		return neighbors;
		
	}

}
