(:*******************************************************:)
(:Test: op-boolean-less-than-7                           :)
(:Written By: Carmelo Montanez                           :)
(:Date: June 15, 2005                                    :)
(:Purpose: Evaluates The "boolean-less-than" function    :)
(: with operands set to "not(false)", "false" respectively.:)
(: Use of lt operator.                                   :)
(:*******************************************************:)
 
fn:not(xs:boolean("false")) lt xs:boolean("false")