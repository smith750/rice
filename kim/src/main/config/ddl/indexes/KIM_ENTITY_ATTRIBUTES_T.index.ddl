CREATE INDEX KIM_ENTITY_ATTRIBUTES_TI1
 ON KIM_ENTITY_ATTRIBUTES_T (ENTITY_ID)
/
CREATE INDEX KIM_ENTITY_ATTRIBUTES_TI2
 ON KIM_ENTITY_ATTRIBUTES_T (ENTITY_ID, SPONSOR_NAMESPACE_ID)
/