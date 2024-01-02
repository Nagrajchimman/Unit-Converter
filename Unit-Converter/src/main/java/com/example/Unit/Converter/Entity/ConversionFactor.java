package com.example.Unit.Converter.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="conversionfactor")
public class ConversionFactor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "from_unit_id")
	private Unit fromUnit;

	@ManyToOne
	@JoinColumn(name = "to_unit_id")
	private Unit toUnit;

	private double factor;

	ConversionFactor() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Unit getFromUnit() {
		return fromUnit;
	}

	public void setFromUnit(Unit fromUnit) {
		this.fromUnit = fromUnit;
	}

	public Unit getToUnit() {
		return toUnit;
	}

	public void setToUnit(Unit toUnit) {
		this.toUnit = toUnit;
	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}

	@Override
	public String toString() {
		return "ConversionFactor [id=" + id + ", fromUnit=" + fromUnit + ", toUnit=" + toUnit + ", factor=" + factor
				+ "]";
	}

	

 	 }
