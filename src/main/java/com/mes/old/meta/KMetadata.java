package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

/**
 * KMetadata generated by hbm2java
 */
public class KMetadata implements java.io.Serializable {

	private KMetadataId id;
	private String metadataname;

	public KMetadata() {
	}

	public KMetadata(KMetadataId id) {
		this.id = id;
	}

	public KMetadata(KMetadataId id, String metadataname) {
		this.id = id;
		this.metadataname = metadataname;
	}

	public KMetadataId getId() {
		return this.id;
	}

	public void setId(KMetadataId id) {
		this.id = id;
	}

	public String getMetadataname() {
		return this.metadataname;
	}

	public void setMetadataname(String metadataname) {
		this.metadataname = metadataname;
	}

}
