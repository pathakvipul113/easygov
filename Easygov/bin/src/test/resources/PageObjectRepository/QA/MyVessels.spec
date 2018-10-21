Page Title: Quest

#Object Definitions
===================================================================================================================
vessel_info_details				css					#vessel-info .vessel-info span
policy_header					css					.profile-tab~div h3:nth-child(1)
policy_subHeader				css					.profile-tab~div h3:nth-child(3)
vessel_image_info				css					.image-info span
vessel_alert_amnt				css					.search-content .amount	
vessel_alert_sub_amnt			css					.search-content .subamount	
vessel_alert_subCtnt			css					.search-content .subcontent .other:nth-child(3)	
vessel_infos					css					li:first-of-type>.search-content>span:not(:nth-child(1))
vessels_header					css					.query-selection>h1
vessels_search					css					.query-selection input
no_result_text					css					.no-result span.title
search_myvessel					css					input.form-control
vessels_list					css					.search-hint li
vessel_profile_text				css					.search-content span.title2
vessel_inform_text				css					#vessel-info h3	
vessel_on_map					css					.search-hint.profile-header a
set_alerts_vsl					css					.profile-tab li:nth-child(3) a
policy_info_vsl					css					.profile-tab li:nth-child(2) a
include_boundary				css					#zone-table table tr:nth-child(2)  td:nth-child(2) input~span
grph_bound_chckbox				css					.accumulation-container div[class='row no-gutters'] .custon-radio-ui.round
grph_movement_chckbox			css					.accumulation-container div[class='row no-gutters alert-row'] .custon-radio-ui.round
grph_milage_chckbox				css					.accumulation-container div[class='row no-gutters alert-row border-bottom-light-blue'] .custon-radio-ui.round
inpbx_movement					css					.accumulation-container.set-alert div[class='row no-gutters alert-row'] div.col-7 input[type='text']
inpbx_policy					css					.accumulation-container.set-alert div[class='row no-gutters alert-row border-bottom-light-blue'] div.col-7 input[type='text']
add_contact_icn					css					.keywords span.edit i
contact_list					css					.contact-table tr:not(:nth-child(1))
add_contact_btn					xpath				.//button[text()='Add contact']
chose_contact_list				css					.keywords span
remove_contact					xpath				.//span[text()='${remove_contact}']
notification_type				css					.accumulation-container>div.row:nth-child(7) input[value='${notification}']~span
port_email_notify_type			css					.accumulation-container>div.row:nth-child(5) div:nth-child(2) div:first-of-type span.checbox	
save_btn						css					.accumulation-container>div.row:last-of-type button:first-of-type
save_modal_box					css					.modal-content
okay_modal_box					css					.modal.vessel-types .modal-content
port_header_title				css					#step1 .accumulation-alert h1
port_search						css					.search-contact input
cancel_ports					xpath				.//div[@class='modal-footer']/descendant::button[text()='Cancel']	
port_search_result				css					.contact-table.ports tr:not(:nth-child(1)) td:nth-child(2)
choose_port_list				css					.accumulation-container div.row:nth-child(1) .keywords>span:not(:nth-child(1)):not(.edit)
choose_contact_list				css					.accumulation-container div.row:nth-child(4) .keywords>span:not(:nth-child(1)):not(.edit)
add_ports						css					.accumulation-container div.row:nth-child(1) .keywords .edit i.qs-icon-cross
add_ports_btn					xpath				.//button[text()='Add Port(s)']
next_port_btn					xpath				.//button[text()='Next']
edit_vessel_types				css					.accumulation-container div.row:nth-child(2) .keywords>span.edit
vessel_modal_header				css					#vessel-types h5
vessel_modal_buttons			css					#vessel-types button
all_vessel_types_checkbox		css					#vessel-types .filter-vessel div.row>div:first-of-type span:nth-child(3)
select_all_vessels_types		css					#vessel-types .filter-vessel div.row>div:first-of-type span:nth-child(2)
all_vessel_checkboxes			css					#vessel-types .filter-vessel div.row>div:not(:nth-child(1)) input
all_vessel_types				css					#vessel-types .filter-vessel div.row>div:nth-child(1) span.checbox
cancel_vessels					xpath				.//*[@id='vessel-types']/descendant::button[text()='Cancel']
threshold_inp					css					.accumulation-amount
add_contacts_header				css					#contacts h5
contact_list_port				css					.contact-table tr:not(:nth-child(1))
add_contact_port_accum			css					.accumulation-alert .alert-row:nth-child(4) .keywords .edit
add_contact_btn_port_modal		xpath				.//button[text()='Add contact']
cancel_btn_contact_modal		xpath				.//*[@id='contacts']/descendant::button[text()='Cancel']
save_changes_btn_modal			xpath				.//*[@id='vessel-types']/descendant::button[text()='Save Changes']
all_contacts_checkbox			css					#contacts .modal-body .row>div:first-of-type span.checbox
contact_search_modal_box		css					#contacts .modal-body .row>div:last-of-type input
edit_vessels_types				css					.accumulation-alert .alert-row:nth-child(2) .keywords span:not(:nth-child(1))
cancel_accum_page				xpath				.//*[@class='accumulation-alert']/descendant::button[text()='Cancel']
next_accum_page_step1			xpath				.//*[@class='accumulation-alert']/descendant::button[text()='Next']
name_alert_textfield			css					.form-control.border-blue	
save_alert_btn					xpath				.//*[@class='accumulation-alert']/descendant::button[text()='Save Alert']													
===================================================================================================================

