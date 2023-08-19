module org.nasdanika.models.togaf.core.processors {
		
	requires transitive org.nasdanika.models.togaf.core;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.togaf.core.processors;
	opens org.nasdanika.models.togaf.core.processors; // For loading resources
	
}
