package giref.database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restriction_enzymes")
public class RestrictionEnzymeEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "enzyme_id")
    private Integer enzymeId;
    @Basic(optional = false)
    @Column(name = "enzyme_name")
    private String enzymeName;
    @Basic(optional = false)
    @Column(name = "recog_pattern")
    private String recogPattern;

    public RestrictionEnzymeEntity() {
    }

    public RestrictionEnzymeEntity(Integer enzymeId) {
        this.enzymeId = enzymeId;
    }

    public RestrictionEnzymeEntity(Integer enzymeId, String enzymeName, String recogPattern) {
        this.enzymeId = enzymeId;
        this.enzymeName = enzymeName;
        this.recogPattern = recogPattern;
    }

    public Integer getEnzymeId() {
        return enzymeId;
    }

    public void setEnzymeId(Integer enzymeId) {
        this.enzymeId = enzymeId;
    }

    public String getEnzymeName() {
        return enzymeName;
    }

    public void setEnzymeName(String enzymeName) {
        this.enzymeName = enzymeName;
    }

    public String getRecogPattern() {
        return recogPattern;
    }

    public void setRecogPattern(String recogPattern) {
        this.recogPattern = recogPattern;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enzymeId != null ? enzymeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RestrictionEnzymeEntity)) {
            return false;
        }
        RestrictionEnzymeEntity other = (RestrictionEnzymeEntity) object;
        if ((this.enzymeId == null && other.enzymeId != null) || (this.enzymeId != null && !this.enzymeId.equals(other.enzymeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "giref.database.RestrictionEnzymeEntity[ enzymeId=" + enzymeId + " ]";
    }
    
}
