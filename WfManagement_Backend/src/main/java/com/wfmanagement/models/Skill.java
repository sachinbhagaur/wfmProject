package com.wfmanagement.models;


	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="SKILLS")
	public class Skill {
		
		@Id
		@Column(name="SKILL_ID")
		private int skillId;
		
		@Column(name="SKILL_NAME")
		private String skillName;

		public int getSkillId() {
			return skillId;
		}

		public void setSkillId(int skillId) {
			this.skillId = skillId;
		}

		public String getSkillName() {
			return skillName;
		}

		public void setSkillName(String skillName) {
			this.skillName = skillName;
		}

		@Override
		public String toString() {
			return "Skill [skillId=" + skillId + ", skillName=" + skillName + "]";
		}

		
		
		

}
