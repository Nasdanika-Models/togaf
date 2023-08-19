# TOGAF
Models of [TOGAF 10](https://www.opengroup.org/togaf/10thedition) concepts. 

## Use Cases

### Reference

The models show relationships between different elements and can be used as reference and study materials.

### Tailor

Model documentation can be "subclassed" and customized to the needs of specific "enterprise" which can be an individual, a team, or an organization.

### Architecture As Code

Create instances of model definitions in YAML, document them in Markdown with embedded Drawio and PlantUML diagrams. 
Store in an "Architecture Repository", e.g. a Git repository.
Generate and publish documentation sites. On GitHub it can be done with GitHub Pages. Publishing can be done on-push using GitHub actions and a Maven plugin (not yet available).
You may also publish models as Maven jars and build federated architecture documentation sites from multiple models similar to how Maven apps are built from multiple dependencies.

This approach to architecture requires minimal infrastructure and as such can be used for efforts like research/POC's.
