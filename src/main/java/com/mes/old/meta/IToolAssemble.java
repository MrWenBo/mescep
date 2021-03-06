package com.mes.old.meta;
// Generated 2017-5-22 1:25:24 by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;

/**
 * IToolAssemble generated by hbm2java
 */
public class IToolAssemble implements java.io.Serializable {

	private IToolAssembleId id;
	private BigDecimal relationQty;

	public IToolAssemble() {
	}

	public IToolAssemble(IToolAssembleId id) {
		this.id = id;
	}

	public IToolAssemble(IToolAssembleId id, BigDecimal relationQty) {
		this.id = id;
		this.relationQty = relationQty;
	}

	public IToolAssembleId getId() {
		return this.id;
	}

	public void setId(IToolAssembleId id) {
		this.id = id;
	}

	public BigDecimal getRelationQty() {
		return this.relationQty;
	}

	public void setRelationQty(BigDecimal relationQty) {
		this.relationQty = relationQty;
	}

}
