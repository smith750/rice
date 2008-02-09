ALTER TABLE KIM_PRNCPL_QLFD_ROLES_T 
ADD CONSTRAINT KIM_PRNCPL_QLFD_ROLES_UK1 UNIQUE
(
PRINCIPAL_ID,
ROLE_ID,
ATTRIBUTE_NAME
) ENABLE
/
ALTER TABLE KIM_PRNCPL_QLFD_ROLES_T
ADD CONSTRAINT KIM_PRNCPL_QLFD_ROLES_FK1 FOREIGN KEY
(
PRINCIPAL_ID
)
REFERENCES KIM_PRINCIPALS_T
(
ID
) ENABLE
/
ALTER TABLE KIM_PRNCPL_QLFD_ROLES_T
ADD CONSTRAINT KIM_PRNCPL_QLFD_ROLES_FK2 FOREIGN KEY
(
ROLE_ID
)
REFERENCES KIM_ROLES_T
(
ID
) ENABLE
/