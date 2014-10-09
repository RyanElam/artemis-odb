package com.artemis.factory;

import com.artemis.EntityFactory;
import com.artemis.annotations.CRef;
import com.artemis.annotations.SetterRef;
import com.artemis.annotations.Sticky;
import com.artemis.component.Asset;
import com.artemis.component.Complex;
import com.artemis.component.Cullible;
import com.artemis.component.HitPoints;
import com.artemis.component.Position;
import com.artemis.component.Sprite;
import com.artemis.component.Velocity;

@CRef({Position.class, Velocity.class, Sprite.class, Cullible.class,
	Asset.class, HitPoints.class})
public interface ExhibitA extends EntityFactory<ExhibitA> {
	// method name maps Position
	ExhibitA position(float x, float y);
	
	// overloaded methods
	ExhibitA velocity(float x, float y);
	ExhibitA velocity(float x);
	
	// strings
	ExhibitA asset(String path);
	
	// sticky
	@Sticky ExhibitA hitPoints(int current);
	
	// aliasing
	@CRef(Cullible.class) ExhibitA culled(boolean culled);
	
	// setter
	@CRef(Complex.class) @SetterRef ExhibitA pos(float x, float y);
	
	// setter, aliased
	@CRef(Complex.class) @SetterRef("vel") ExhibitA hoho(float x, float y);
}
