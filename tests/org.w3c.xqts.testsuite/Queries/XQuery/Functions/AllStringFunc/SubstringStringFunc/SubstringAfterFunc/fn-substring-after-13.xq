(:*******************************************************:)
(:Test: fn-substring-after-13                           :)
(:Written By: Carmelo Montanez                           :)
(:Date: Fri May 27, 2005                                 :)
(:Purpose: Evaluates The "substring-after" function     :)
(: with the arguments set as follows:                    :)
(:$arg1 = xs:string("A")                                 :)
(:$arg2 = "A"                                            :)
(:*******************************************************:)

fn:count(fn:substring-after(xs:string("A"),"A"))