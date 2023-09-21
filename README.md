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

This model is intended to be conceptual and follow the standard as close as possible. As such, it would not be usable AS-IS for architecture-as-code - another "physical" model would be required. The physical model will need additional "helper" classes and relationships to be usable "as-code". Such additional relationship would create "noise" in this model and this is why they should be separated into a another model. There might be multiple physical models and most likely many organizations would need their own physical models reflecting their existing structures - how people are organized, how assets are tracked. 

The physical model may reference other models. For example, most elements may implement [Marked](http://ncore.models.nasdanika.org/references/eClassifiers/Marked/index.html) interface to track data provenance - wheren and when it was loaded from. They may also extend [Periond](http://ncore.models.nasdanika.org/references/eClassifiers/Period/index.html) or contain phases extending Period in order to model the temporal aspect of model/architecture elements. 

Some archtiecture classes may extend classes from the [Multiple-Criteria Decision Analysis](https://github.com/Nasdanika-Models/multiple-criteria-decision-analysis) model. For example, ``Architecture`` would extend ``Alternative`` to allow to perform disciplined comparison of different options. 

https://github.com/Nasdanika-Models/architecture is intended to be a "reference implementation" of a physical model which can be used as-is, extended, or tailored.

#### Delivery vehicles/mechanisms

It was mentioned above that the model can be delivered as a file or a set of files and as a Maven jar. 
This section provides an overview of different way to deliver architecture information to stakeholders:

* Model in XMI or binary or compressed binary format. Can be delivered via a version control system, web site, binary artifact (Maven jar). Consumers would need to use Java to work with the model.
* Web sites generated from the model - static or dynamic targeted to different stakeholders.
* Executable war file - stakeholders may host web sites in their environments including local environments.
* Shared model repository, e.g. [CDO](https://projects.eclipse.org/projects/modeling.emf.cdo). Can be used in the same way as models. One usage scenario is to host the model in a repository and have dynamic web UI and API to serve data from the repository.
* REST API - static generated from the model (JSON or JavaScript module(s) with behavior) or dynamic.
* Language bindings - static, generated from the model or calling the REST API (static or dynamic). E.g. a C# client.
* Command Line Interface (CLI) - a hierarchy of commands, can be implemented using https://picocli.info/. The CLI can contain commands to:
    * Query the repository
    * Generate
        * Reports and documents. E.g. a static web site for a particular stakeholder.
        * Executable code and solutions from patterns and info in the repository. For example:
            * Generate a micro-service Maven project using an organization-specific pattern
            * Creata a version control repository and store microservice code in that repository
            * Create a CI/CD pipeline to deploy the microservice to the DEV environment
            * Create an issue tracker project and issues for manual tasks, if not everything is automated
        
## Resources

* [Azure Model](https://github.com/Nasdanika-Models/azure) - explains how a "generic" Azure metamodel can be tailored to organization's needs.
