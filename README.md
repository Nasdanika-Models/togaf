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

Architecture partitioning can be achieved using branches and forks:

* Top level archtiecture function creates an architecture model for the entire enterprise. Baseline elements such as servers, cloud ([Azure](https://github.com/Nasdanika-Models/azure)) subscriptions, tenants, resource groups etc. can be pulled from information systems and cross-referenced. A computer with 8Gb of RAM can easily load a model with a few millions of entities, which should be more than enough for an architecture repository. The model can be stored in a source repository and published to a binary repository, e.g. as a Maven jar.
* Lower level organizations:
    * Consume the top level model either by forking or by pulling it from a binary repository - adding a dependency to pom.xml in the case of Maven.
    * May add their own model elements and meta-model classes. E.g. some organization may use some specific types of artifacts or have a specific way of organizing people into teams. Or they may need to go to a higher level of details in the repository. For example, load information about [Maven](https://github.com/Nasdanika-Models/maven) projects/modules used by the organizaiton and their interdependencies.
    * May contribute to higher-level repositories by creating pull requests. E.g. a lower level org may implement a new meta-model class or a utility or a report generator and contribute it for wider use.
* Forking/branching can also be used for developing new architectures on top of the baseline architecture or a future architecture.

This approach to architecture requires minimal infrastructure and as such can be used for efforts like research/POC's.
