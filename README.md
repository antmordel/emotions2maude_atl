## Running the transformation

It should be done with a new ATL configuration file.

## Case studies

### Production Line System

1. Run the PLS ATL configuration file.
2. Run the GenTextPLS java file.

*Legacy*: Runs in 20122ms
*Current*:
    - commit [cbfd818](https://github.com/antmordel/emotions2maude_atl/commit/cbfd818d4b78fd3c8cd3b472e4e436ec4c2c6db8): Does not work due to `oid` operator.
    - commit [](): Working and in time 21854ms, still without modifications.
