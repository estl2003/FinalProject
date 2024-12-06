package app.entities;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class LostItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

<<<<<<< Updated upstream
    @NotNull
    @Size(max = 100)
    @Column
    private String itemName;

    @NotNull
    @Column
    private LocalDate dateLost;
    
    @NotNull
    @Size(max = 255)
    @Column
    private String description;

    @NotNull
    @Column
    private String reporterName;

    @NotNull
    @Column
    private String reporterPhoneNumber;

    @NotNull
    @Column
    private String location;

    @Column
    private boolean isFound = false;

    

	public LocalDate getDateLost() {
	    return dateLost;
	}

	public void setDateLost(LocalDate dateLost) {
	    this.dateLost = dateLost;
	}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getReporterPhoneNumber() {
        return reporterPhoneNumber;
    }

    public void setReporterPhoneNumber(String reporterPhoneNumber) {
        this.reporterPhoneNumber = reporterPhoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isFound() {
        return isFound;
    }

    public void setFound(boolean found) {
        isFound = found;
    }
}
=======
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@NotNull
	@Column
	private String itemName;
	
	@NotNull
	@Column
	private String dateLost;
	
	@NotNull
	@Column
	private String locationLost;
	
	@Column
	private double latitude;
	
	@Column
	private double longitude;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDateLost() {
		return dateLost;
	}

	public void setDateLost(String dateLost) {
		this.dateLost = dateLost;
	}

	public String getLocationLost() {
		return locationLost;
	}

	public void setLocationLost(String locationLost) {
		this.locationLost = locationLost;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "LostItem [id=" + id + ", itemName=" + itemName + ", dateLost=" + dateLost + ", locationLost="
				+ locationLost + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
	
	
	
}
>>>>>>> Stashed changes
