(:*******************************************************:)
(: Test: K-Literals-6                                    :)
(: Written by: Frans Englich                             :)
(: Date: 2006-10-05T18:29:36+02:00                       :)
(: Purpose: '"fo""""' is a valid string literal.         :)
(:*******************************************************:)
"fo""o" eq concat("fo", """", "o")