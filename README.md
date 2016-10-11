## Running the transformation

It should be done with a new ATL configuration file.

## Strong limitations

Operator `eMotions.parseExp` cannot be set with more than one argument, so the context (of the token)
is left for future work.

## Case studies

### Production Line System

1. Run the PLS ATL configuration file.
2. Run the GenTextPLS java file.

*Legacy*: Runs in 20122ms
*Current*:
    - commit [cbfd818](https://github.com/antmordel/emotions2maude_atl/commit/cbfd818d4b78fd3c8cd3b472e4e436ec4c2c6db8): Does not work due to `oid` operator.
    - commit [eff4ecc](https://github.com/antmordel/emotions2maude_atl/commit/eff4ecc830e03f04225cc780d883ca54044ba504): Working and in time 21854ms, still without modifications.

### Palladio

1. Run the Palladio ATL configuration file.
2. Run the GenTextPalladio java file.

*Legacy*:
  - commit [c714d9b](https://github.com/antmordel/emotions2maude_atl/commit/f8f21a4acac75819ca38a2d6756d5638a23e1b0f): Does not work since `parseExp` is not recognized.
